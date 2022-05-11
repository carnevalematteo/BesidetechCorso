import java.util.Arrays;

public class FilterW {

    /**
     * questo medoto dato un array in ingresso filtra lo stesso per creare un nuovo
     * array nel quale verràno inserite eventuali parole ripetute.
     * @author matteo carnevale.
     * @param   parole rappresenta l'array contenente le parole.
     * @return un array contenente esclusivamente le parole doppioni senza ripetizioni.
     */
    public String[] filterWord(String[] parole){

        String [] foundWord= new String[parole.length/2];

        String lastWord="";

        String result[];

        int count =0;

        for(int i=0,j=1;i<parole.length && j< parole.length-1;i++,j++){

            if(parole[i].equals(parole[i+1])){

                lastWord=parole[i];

                for(String s : parole){

                    if (s.equals(lastWord)){

                        s="";
                    }
                }


                foundWord[count]=lastWord;
                count++;

            }

        }

        int pos = 0;
        result = new String[count];

        for(int i =0 ;i< foundWord.length;i++){

            if(foundWord[i]!=null){

                result[pos]=foundWord[i];

                pos++;
            }
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

}
