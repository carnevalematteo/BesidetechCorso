package eccezioni;

// Dato un array String trovare le parole ripetute array max dimenrsione 10 array max dimenrsione 10
//che verra ritornato dal metodo creaimo una nuova classe di eccezzioni dove se l'array iniziale che fornisco in
// input e vuoto o uguale a 0 fare scattare appunto l'eccezzione

public class es1 {
    public static void main(String[] args) {
        String[] arrDiStringa = {"panda", "500", "giulietta", "giulia", "panda", "giulia"};


        try {
            String[] result = paroleRipetute(arrDiStringa);
            System.out.println(result);
        } catch (EmptyArrException e) {
            System.out.println(e.getMessage());
        }


    }


    public static String[] paroleRipetute(String[] arr) throws EmptyArrException {

        if(arr.length==0){
            throw new EmptyArrException("Errore: array vuoto");
        }

        String[] arrDoppione = new String[arr.length/2];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i].equals(arr[j]) && i!=j){
                    if(!checkDoubleString(arrDoppione, arr[i], count)){
                        arrDoppione[count] = arr[i];
                        count++;
                    }
                }
            }
        }
        return arrDoppione;
    }


    public static boolean checkDoubleString (String[] nomi, String nome, int count){
        for (int i=0; i < count; i++){
            if(nomi[i].equals(nome))
                return true;
        }
        return false;
    }
}
