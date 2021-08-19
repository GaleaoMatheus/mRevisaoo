/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

import java.util.Scanner;

/**
 *
 * @author 182110031
 */
public class MRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);//usar no console
        boolean verifica;//var booleana | true or false | 0 or 1
        int num1;//var do tipo inteiro 11 posições
        short num2;//var = smalint inteiro pequeno 4 posições
        long num3;//var = bigint inteiro grande | contador do youtube 
        double num4;//var = decimal, numeric com casas decimais 
        float num5;//var = com casas decimais e é menor que o double
        byte b;//num inteiro valor maximo 127
        String texto;//aceita tudo em formato texto
        String textoCurto;
        char sexo;
       
        System.out.println("Hello Hell!");
        System.out.println("Informe um numero inteiro: ");
        num1 = ler.nextInt();
        System.out.println("Informe um numero ate 127: ");
        b =ler.nextByte();
        System.out.println("Informe um numero inteiro médio: ");
        num2 = ler.nextShort();
        System.out.println("Informe um numero inteiro grande: ");
        num3 = ler.nextLong();
        System.out.println("Informe um numero decimal: ");
        num4 = ler.nextDouble();
        System.out.println("Informe um numero decimal pequeno: ");
        num5 = ler.nextFloat();
        System.out.println("Informe seu nome completo: ");
        ler.nextLine();//sempre usar para leitura de string
        texto = ler.nextLine();
        texto = texto.toUpperCase();
        System.out.println("Informe o primeiro nome de sua mãe: ");
        textoCurto = ler.next();
        System.out.println("Informe seu sexo: ");
        sexo = ler.next().charAt(0);
        
        System.out.println("---Impressão---");
        System.out.println("num1: " +num1);
        System.out.println("Byte: " +b);
        System.out.println("short: " +num2);
        System.out.println("long: " +num3);
        System.out.println("double: " +num4);
        System.out.println("float: " +num5);
        System.out.println("Seu nome é:" +texto);
        System.out.println("Nome da sua mãe é: " +textoCurto);
        System.out.println("Seu sexo é: " +sexo);
        verifica = num1>=num2;
        if(verifica){
            System.out.println("Num1 é maior ou igual que num2.");
        }else{
            System.out.println("Num2 é maior que num1.");
        }
        
        
        
        
     
    }
    
    
}
