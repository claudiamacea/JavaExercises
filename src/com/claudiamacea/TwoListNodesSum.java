package com.claudiamacea;

public class TwoListNodesSum {
    public int val;
    TwoListNodesSum next;

    public TwoListNodesSum(){};

    public TwoListNodesSum(int val){
        this.val = val;
    }

    public TwoListNodesSum(int val, TwoListNodesSum node){
        this.val = val;
        this.next = node;
    }

    public static void main(String[] args) {

        //se creeaza primul LinkedList - l1
        TwoListNodesSum l1 = new TwoListNodesSum(9);
        TwoListNodesSum current = l1;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;

        current.next = null;


        current = l1;

        while(current!=null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();

        //se creeaza al doilea LinkedList - l2
        TwoListNodesSum l2 = new TwoListNodesSum(9);
        current = l2;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = new TwoListNodesSum(9);
        current = current.next;
        current.next = null;

        current = l2;
        while(current!=null) {
            System.out.print(current.val + " ");
            current = current.next;
        }


        int l1Val = 0;
        int l2Val = 0;
        int recurrentSum = 0;
        int sum = 0;

        System.out.println();
        System.out.println();

        TwoListNodesSum l3 = new TwoListNodesSum(0);
        current = l3;


        while(l1!=null || l2!=null){


            if(l1!=null) {
                l1Val = l1.val;
                l1=l1.next;
            }else{
                l1Val = 0;
            }
            if(l2!=null) {
                l2Val = l2.val;
                l2=l2.next;
            }else{
                l2Val = 0;
            }

            sum = l1Val + l2Val + recurrentSum;
            System.out.println("suma  " + sum);
            current.val = sum % 10;

            if(sum<10) {
                recurrentSum = 0;
            }else{
                recurrentSum = 1;
            }

            if(l1!=null || l2!=null){
                current.next = new TwoListNodesSum(0);
                current = current.next;
            }else{
                if(recurrentSum==1){
                    current.next = new TwoListNodesSum(1);
                    current = current.next;
                    current.next = null;
                }else{
                    current.next = null;
                }
            }
        }

        current = l3;
        while(current!=null) {
            System.out.print(current.val + " ");
            current = current.next;
        }


    }
}
