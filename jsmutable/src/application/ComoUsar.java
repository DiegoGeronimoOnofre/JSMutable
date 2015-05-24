

/**
The MIT License (MIT)
Copyright (c) 2015 Diego Geronimo D Onofre
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files JSMutable(Java Simple Mutable), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/


package application;

import jsm.Mutable;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author   Diego Geronimo Onofre
 * @channel  www.youtube.com/user/cursostd
 * @phone    (44) 99802997
 * @facebook www.facebook.com/diegogeronimoonofre 
 */

/**
 * @See jsmutable.Mutable
 */

public class ComoUsar {

    public static class XMutable extends Mutable
    {
        /*
         * É necessário obrigatoriamente criar um 
         * construtor com a assinatura abaixo para
         * que não ocorra nenhuma exceção em Mutable.
         * Se por acaso você esquecer e criar algum construtor
         * com parâmetros a classe Mutable vai te avisar com
         * com a mensagem: 
         * 
         * Classes derivadas de "jsm.Mutable" devem conter 
         * somente um construtor e o mesmo não deve conter parâmetros.
         */
        
        public XMutable() throws Exception
        {}
        
        /*
        public XMutable(int value) throws Exception
        {
            
        }*/
        
        /* Se o comentário do construtor acima for removido
         * Mutable enviará a seguinte mensagem:
         * 
         * Classes derivadas de "jsm.Mutable" devem conter 
         * somente um construtor e o mesmo não deve conter 
         * parâmetros.
         */
            
         /* Não estou usando métodos getter ou setter
          * para simplificar a utilização de Mutable, entretanto
          * é altamente recomendável que você utilize métodos getters e setters
          * em aplicações sérias.
          */

         /* Todas vez que digo "primitivos" na documentação abaixo
          * estou me referindo aos seguintes tipos de plataforma Java
          * 
          *           boolean
          *           char
          *           byte
          *           short
          *           int
          *           long
          *           float
          *           double
          * 
          * OBS:
          * Classes derivadas desta podem conter somente 
          * campos de valores primitivos ou <code>String</code> 
          * ou arrays de tipos primitivos ou arrays de 
          * <code>String</code> e somente um construtor 
          * que não requer qual quer parâmetro
          * 
         */
        
        public String stringValue;

        public int intValue;

        public String[] arrayValue;
        
        //public java.util.ArrayList<Object> list = new java.util.ArrayList(); - Errado
        
        /*
         * Se o comentário da linha de código acima foi removido
         * Mutable enviará a seguinte mensagem:
         * 
         * O campo "list" da classe "application.ComoUsar$XMutable 
         * não é um tipo primitivo, String ou array de tipo primitivo 
         * ou array de String
         * 
         */
    }
    
    public static void main(String[] args) {
        
        try{
            //Gerando uma instância de XMutable (que extende Mutable)
            //em first para ter um objeto como exemplo de utilização de Mutable.
            XMutable first = new XMutable();
            
            //Fixando valores no objeto first para
            //testar a classe Mutable.
            first.stringValue = "valor de teste";
            first.intValue = 10;
            first.arrayValue = new String[]{"Primeiro", "Segundo", "Terceiro"};
            
            
            //Chamando o método toBytes para converter o objeto first
            //em um vetor de bytes que mais pra frente será restaurado
            //por meio do método Mutable.bytesToObject(bytes);
            byte[] bytes = first.toBytes();
            
            //Como sabemos que o vetor "bytes" possui o objeto first formatado, 
            //então a linha abaixo está chamando o método Mutable.bytesToObject
            //para restaurar uma cópia do objeto first na variável de instância second
            //por meio do vetor de bytes "bytes".
            XMutable second = (XMutable) Mutable.bytesToObject(bytes);
            
            //Logo abaixo estou simplesmente fazendo uma verificação para saber
            //se todo o processo de serialização foi concluído com sucesso.
            //Saberemos então se o tal processo ocorreu com sucesso se a mensagem
            //"O primeiro objeto é igual ao segundo" aparecer na tela.
            if ( first.equals(second) )
                showMessageDialog(null, "O primeiro objeto é igual ao segundo.");
            else
                showMessageDialog(null, "O primeiro objeto é igual ao segundo.");
        }
        catch ( Exception e ){
            //Se algum problema ocorreu, saberemos com a linha de código abaixo.
            System.out.println(e.getMessage());
        }
    }
}
