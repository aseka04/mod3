public class tap1 {
    public void Process(int[] numbers){
        if(numbers != null || numbers.length>0){
            for(int num : numbers){
                if(num>0){
                    System.out.println(num);
                }
            }
        }
    }
}
