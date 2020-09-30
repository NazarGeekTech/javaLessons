package com.company;

public class Consumer<T extends Number,S extends Number,V extends Number,D extends Number> implements Measurable  {
    private T consume;
    private S amountUsage;
    private V month;
    private D payed;

    public Consumer(T consume, S amount, V month,D payed) {
        this.consume = consume;
        this.amountUsage = amount;
        this.month = month;
        this.payed = payed;

    }

    public T getConsume() {
        return consume;
    }

    public S getAmountUsage() {
        return amountUsage;
    }

    public V getMonth() {
        return month;
    }

    public D getPayed() {
        return payed;
    }

    /*declared to have chance to calculate dues in methods down below*/
    public static double billingDay;
    @Override
    public void billMaker(Number number, Number number2) {
         billingDay = number.doubleValue()*number2.doubleValue();
        System.out.println("Your amount per month: "+ billingDay+"$");
    }

    @Override
    public void calculatorDues(Number number, Number number2) {
        double due = number.doubleValue() - number2.doubleValue();
        if (due<1){
            System.out.println("we owe you: " + due+"$");
        }else {
            System.out.println("You owe us: "+ due+"$");
        }
    }

}
