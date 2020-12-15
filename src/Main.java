public class Main {
    public static void main(String[] args) {

        int vasyaAge = 40;
        int katyaAge = 14;
        int mishaAge = 32;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge > mishaAge && vasyaAge > katyaAge) {
            max = vasyaAge;
            if (katyaAge - mishaAge > 0) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }
        }
        if (katyaAge > vasyaAge && katyaAge > vasyaAge) {
            max = katyaAge;
            if (mishaAge - vasyaAge > 0) {
                middle = mishaAge;
                min = vasyaAge;
            } else {
                middle = vasyaAge;
                min = mishaAge;
            }
        }
        if (mishaAge > katyaAge && mishaAge > vasyaAge) {
            max = mishaAge;
            if (vasyaAge - katyaAge > 0) {
                middle = vasyaAge;
                min = katyaAge;
            } else {
                middle = katyaAge;
                min = vasyaAge;
            }
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);
    }
}