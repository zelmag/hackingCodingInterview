class stock_prices{
  public static Tuple find_buy_sell_stock_prices(
    int[] array) {
    
    int buy = 0;
    int sell = 1;
    Tuple<Integer,Integer> res = new Tuple<>(array[buy],array[sell]);
    for(int i = 0; i < array.length; i++){
      if(array[i] <= array[buy]){
        buy = i;
        sell = i;
      }
      if(array[i] > array[sell]){
        sell = i;
      }
      if(array[sell] - array[buy] > res.y - res.x){
        res.y = array[sell];
        res.x = array[buy];
      }
    }
