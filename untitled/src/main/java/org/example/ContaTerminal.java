package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();

        System.out.println("Por favor, digite a sua  Agência !");
        agencia = sc.next();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo !");
        saldo = sc.nextDouble();

        sc.close();


        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(" conta " + numero).concat( " e seu saldo " + saldo + " já está disponível para saque."));
    }
}