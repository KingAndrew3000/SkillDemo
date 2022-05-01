public class SkillDemo{
    public static int highestInteger(int[] list){
        int highest = list[0];
        for(int i = 0; i < list.length; i++){
            if(list[i] > highest){
                highest = list[i];
            }
        }
        return highest;
    }


}
