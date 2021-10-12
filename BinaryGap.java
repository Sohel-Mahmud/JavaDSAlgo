public class BinaryGap {
    public static void main(String[] args) {

       /* int value = 1041;
        System.out.println(Integer.toBinaryString(value));
        int maxgap = 0;
        int currentgap = 0;

        while(value>0){
            if(value % 2 == 0){
                currentgap++;
                if(maxgap < currentgap){
                    maxgap = currentgap;
                }
            }else if(value % 2 == 1){
                currentgap=0;
            }
            value = value/2;
        }

        System.out.println(maxgap);*/
        String binary = Integer.toBinaryString(1041);
        int compte = 0, gapCount = 0, result = 0;
        char[] value = binary.toCharArray();

        System.out.println(value);

        for (char v : value) {
            if (v == '1') {
                compte++;
            }

            if (v == '0') {

                if (compte == 2) {

                    if (result < gapCount) {
                        result = gapCount;
                    }

                    gapCount = 0;
                } else {
                    result = 0;
                }

                gapCount++;
            }
        }

        System.out.println(result);
    }
}
