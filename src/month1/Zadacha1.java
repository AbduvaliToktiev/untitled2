package month1;

public class Zadacha1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String[] pyt = {"right", "right", "left", "top", "top", "left", "down", "down"};

        for (int i = 0; i < pyt.length; i++){
            switch (pyt[i]){
                case "right": x++; break;
                case "left": x--; break;
                case "down": y--; break;
                case "top": y++; break;
            }
        }
        if (x == 0 && y == 0){
            System.out.println("0 metr");
        } else if (x == 0) {
            System.out.println(Math.abs(y) + " metr");
        }else if (y == 0) {
            System.out.println(Math.abs(x) + " metr");
        }else {
            double sqrt = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println(sqrt + " metr");
        }

    }
}
