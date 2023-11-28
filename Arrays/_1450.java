public class _1450{
    public static void main(String[] args){
        int start[] = {4};
        int end[] = {4};
        int time = 4;
        System.out.println(busyStudent(start, end, time));
    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime){
        int n = startTime.length, count = 0;
        for(int i = 0; i < n; i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                count++;
            }
        }
        return count;
    }
}