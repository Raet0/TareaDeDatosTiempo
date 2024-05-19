import java.util.Random;

public class Tiempo {
        public static void main(String[] args) throws Exception {
        int arreglo[];
        int arregloAnterior[];

        Metodos ordenamiento = new Metodos();
        long start, end;

        arreglo=new int[10];
        for (int i = 0; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        ordenamiento.imprimirArreglo(arreglo);
        System.out.println("");
        start = System.nanoTime();   ordenamiento.burbujaMejorado(arreglo);  end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");


        arregloAnterior=arreglo.clone();
        arreglo = new int[20];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 10; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        ordenamiento.imprimirArreglo(arreglo);
        System.out.println("");
        start = System.nanoTime(); ordenamiento.burbujaMejorado(arreglo); end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");


        
        arregloAnterior=arreglo.clone();
        arreglo = new int[100];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 20; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}
        ordenamiento.imprimirArreglo(arreglo);
        System.out.println("");
        start = System.nanoTime(); ordenamiento.burbujaMejorado(arreglo); end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");


        
        arregloAnterior=arreglo.clone();
        arreglo = new int[1000];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 100; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}

        start = System.nanoTime(); ordenamiento.burbujaMejorado(arreglo); end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");


        
        arregloAnterior=arreglo.clone();
        arreglo = new int[5000];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 1000; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}

        start = System.nanoTime(); ordenamiento.burbujaMejorado(arreglo); end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");


        
        arregloAnterior=arreglo.clone();
        arreglo = new int[10000];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 5000; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}

        start = System.nanoTime(); ordenamiento.burbujaMejorado(arreglo); end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");


        
        arregloAnterior=arreglo.clone();
        arreglo = new int[30000];
        for (int i = 0; i < arregloAnterior.length; i++) {arreglo[i]=arregloAnterior[i];}
        for (int i = 10000; i < arreglo.length; i++) {arreglo[i]=new Random().nextInt(200);}

        start = System.nanoTime(); ordenamiento.burbujaMejorado(arreglo); end = System.nanoTime(); 
        System.out.println("Con 10 valores el tiempo es de "+(end-start)*0.000000009+" seg.");

    }

}
