public class IncrementoDecremento{
    public static void main(String [] args){
        int count = 20;
        count++; // post-incremento
        count++;
        System.out.println(count++); // se aplica el incremento después de ejecutar la línea de código
        ++count; // pre-incremento
        ++count;
        System.out.println(++count); // se aplica el incremento antes de ejecutar la línea de código

        count--; // post-decremento
        count--;
        System.out.println(count--); // se aplica el decremento después de ejecutar la línea de código
        --count; // pre-decremento
        --count;
        System.out.println(--count); // se aplica el decremento antes de ejecutar la línea de código


        // Atajos de asignación: aplica con todos los operadores aritméticos
        count = count + 5;
        count += 5;

        count = count - 5;
        count -= 5;

        System.out.println(count);

    }
}