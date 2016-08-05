/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

/**
 *
 * @author amitoshseu
 */
public class Printer implements Runnable{
    String label;
    int limit;

    public Printer(String label, int limit) {
        this.label = label;
        this.limit = limit;
    }
    
    public void print(){
        for(int i=1; i<= limit; i++)
            System.out.printf("%s%d\n",label,i);
    }

    @Override
    public void run() {
        print();
    }
}
