/*
The MIT License (MIT)
Copyright (c) 2022 Carlos Eduardo <cduhno@gmail.com>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package mediaaluno;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = input.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media >=7){
            System.out.printf("O aluno obteve média %.1f e está aprovado. ", media);
        }
        else if (media >= 3){
            System.out.printf("O aluno obteve média %.2f e fará exame final. ", media);
        }
        else {
            System.out.printf("O aluno obteve média %.2f e está reprovado. ", media);
        }
    }
    
}
