package com.company.automatas.lexico.palabrasReservadas;

public class Si {
    String entrada;
    int tama;
    int actual;

    public int comprobar(String entrada){
        this.entrada = entrada;
        this.tama = entrada.length();
        this.actual = 0;
        return q0();
    }

    public int comprobar(){
        return q0();
    }

    int q0(){
        if(actual <  tama){
            char car = entrada.charAt(actual);
            actual++;
            if(car=='s')
                return q1();
            else
                return -1;
        }else{
            return -1;
        }
    }

    int q1(){
        if(actual <  tama){
            char car = entrada.charAt(actual);
            actual++;
            if(car=='i')
                return q2();
            else
                return -1;
        }else{
            return -1;
        }
    }

    int q2(){
        if(actual <  tama){
            char car = entrada.charAt(actual);
            actual++;
            if(car=='n')
                return q3();
            else
                return -1;
        }else{
            return 6;
        }
    }

    int q3(){
        if(actual <  tama){
            char car = entrada.charAt(actual);
            actual++;
            if(car=='o')
                return q4();
            else
                return -1;
        }else{
            return -1;
        }
    }
    int q4(){
        if(actual <  tama){
            return -1;
        }else{
            return 7;
        }
    }
}