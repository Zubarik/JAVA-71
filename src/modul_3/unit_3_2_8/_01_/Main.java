package modul_3.unit_3_2_8._01_;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String s) {
        String[] pars = s.split(" ");
        String s2="";
        for (int i = 0;i< pars.length;i++){
            s2+=pars[i];
        }
        return s2;
    }
}
