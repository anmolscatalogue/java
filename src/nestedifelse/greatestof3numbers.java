package nestedifelse;

public class greatestof3numbers {
    public static void main (String args[]){
        int a = 1;
        int b = 2;
        int c = 3;

        if (a>b) {
            System.out.println("a is greater then b");
            if (a > c) {
                System.out.println("a is greater then c");
                System.out.println("a is greatest than all numbers " + a);
            } else {
                System.out.println("c is greater then a");
                System.out.println("c is greatets of all numbers " + c);
            }
        }
        else{
            if(a<b){
                System.out.println("b is greater then a");
                if(b>c){
                    System.out.println("b is greater than c");
                    System.out.println(" b is greatets of all numbers "+b);
                }
                else{
                    System.out.println("c is bigger than b");
                    System.out.println("c is largest of all numbers "+c);
                }
            }
            }
        }

    } // in this code we learnt the use of nested loops i.e a loop inside another loop
// to run a code use shortcut command 4






