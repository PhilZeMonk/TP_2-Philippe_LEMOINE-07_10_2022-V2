public class TP_3 {
    public static void main(String[] args) {
        chat(6, 2);
        chat (3, 6);
    }

    public static void chat(int height, int width) {
        if (width<2){
            System.out.println("La largeur du chat n'est pas valide");
        }
        else if (height < 3) {
            System.out.println("La largeur du chat n'est pas valide");
        }
        else{
            String tete = "|\\";
            for (int i = 0; i <= width; i++){
                tete += "_";
            }
            tete += "/|";
            System.out.println(tete);
            for (int i = 0; i < (height-1)/2; i++){
                String visage_h = "|";
                for (int j = 0; j < width + 3; j++){
                    visage_h += " ";
                }
                visage_h += "|";
                System.out.println(visage_h);
            }
            String yeux ="| 0";
            for (int k = 0; k< width - 1; k++){
                yeux += "_";
            }
            yeux += "0 |";
            System.out.println(yeux);

            for (int l = height%2 + 1; l < height-1; l++){
                String visage_b = "|";
                for (int m = 0; m < width + 3; m++){
                    visage_b += " ";
                }
                visage_b += "|";
                System.out.println(visage_b);
            }
            String bouche = "|  ";
            for (int i = 0; i <= width-2; i++){
                bouche += "^";
            }
            bouche += "  |";
            System.out.println(bouche);
            String bas = " \\";
            for (int i = 0; i <= width; i++){
                bas += "_";
            }
            bas += "/";
            System.out.println(bas);
        }
    }
}
