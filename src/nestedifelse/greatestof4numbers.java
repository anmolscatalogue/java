package nestedifelse;

public class greatestof4numbers {
    public static void main (String args[]){
        int a = 8;
        int b = 2;
        int c = 10;
        int d = 4;

        if(a>b && a>c && a>d){
            System.out.println("A is greatest");
        }
        else if( b>c && b>d){
            System.out.println("B is greatest");
        }
        else if(c>d){
            System.out.println("C is greatest");
        }
        else{
            System.out.println("D is greatest");
        }

    }
} // always approach these kinda problems with operatos for shorter code




