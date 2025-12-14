public class StringArray {
    public static void main(String[] args) {
        

        int [] numbers = {10,29,22,73,19,21};

        System.out.println("Size of numbers array is: " + numbers.length);

        String[] fighterNames = {"Ken", "Ryu", "E. Honda", "Cammy", "Chun Lee", "Barlog", "Znageif", "Sakura"};

        System.out.println("Number of names that I was able to remember: " + fighterNames.length);

        for (int i=0; i<fighterNames.length; i=i+2)
        {
            System.out.println(fighterNames[i] + "\tVS\t" + fighterNames [i+1]);
        }

        String [] names = {"Al-Hilal", "Al-Nassr", "Al-Ittihad", "Al-Ahli", "Al-Qadsyyah"};

        int matchCounter = 1;
        for (int i=0; i<names.length; i++)
        {
            for (int j=0; j<names.length; j++)
            {
                if (names[i]==names[j])
                    continue;
                else
                {
                    System.out.println ("Match No. " + matchCounter + " is: " + names[i] + " vs " + names[j]);
                    matchCounter++;
                }
            }
            
        }





    }
}
