public class Ejercicios{
    public Ejercicios(){
    }
    
    public int sumaConsecutivos(int num){ //5

        //CASO BASE

        System.out.println("El num es " + num);

        if(num == 1)
            return num;
        //PARTE RECURSIVA

        return num + sumaConsecutivos( num-1);
    }


    public int sumaConsecutivosPasos(int num){ //5
        
        //CASO BASE

        if(num == 1)
            return num;

        //PARTE RECURSIVA

        int resultadoRecursivo = sumaConsecutivosPasos( num - 1);

        int resultadoOperacion = num + resultadoRecursivo;

        System.out.println("resultadoOp =  " + num + "+" + "sumaConsecutivaPasos(" + (num - 1) + ")" );
        return resultadoOperacion;
    }
    


    //Potencia de un numero: Escribe una funcion recursiva que calcule la potencia de un numero base
    //elevado a un exponente entero.
    // Por ejemplo, si base es 2 y exponente es 3,
    // la funcion debe devolver 2 ^3 = 8

    public int getPotencia(int base, int exponente){
        if (exponente == 1)
            return base;
        return base * getPotencia(base,  exponente - 1);
    
    }
    
    public int sumaDigitos(int num){
        if (num < 10)
            return num;

        return (num % 10) + sumaDigitos(num/10);

    }


}

