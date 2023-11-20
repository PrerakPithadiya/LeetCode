public class _2798{
    public static void main(String[] args){
        int arr[] = {5,1,4,2,2};
        int met = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(arr, met));
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int workTime : hours){
            if(target <= workTime){
                count++;
            }
        }
        return count;
    }
}