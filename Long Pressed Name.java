//



class Main {
    public static void main(String[] args) {
        String name="saeed";
        String typed="ssaaedd";
     int i=0;
    int j=0;
    int count=0;
        while(i<name.length() && j<typed.length()){
            if(i==name.length()-1 && j==typed.length()-1){
                    System.out.println("true");
                    break;
                }
                else{
                    if(name.charAt(i)!=typed.charAt(j)){
                        i++;
                        count++;
                        System.out.println("i "+i+ "j "+j);
                    System.out.println("count "+count);
                        if(count>1){
                            break;
                        }
                        count=0;
            }
            else{
                // if(i==name.length()-1 && j==typed.length()-1){
                //     System.out.println("true");
                // }
                // else{
                j++;
                    // count++;
                    // i++;
                    // System.out.println("i "+i+ "j "+j);
                    // System.out.println("count "+count);
                    // if(count>1){
                    //     break;
                    // }
                    //count=0;
                //}
                
            }
                }
            //count=0;
        }
                System.out.println("i "+i);

            System.out.println("j "+j);
    }
}
