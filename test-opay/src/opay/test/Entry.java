package opay.test;

import java.util.HashMap;

public class Entry {
    public static void main(String[] args) {
        System.out.printf("Hello World");
    }


    public int solution(String A, String B) {
        // write your code in Java SE 8
        HashMap<Character, Integer> ranking = new HashMap<>();
        ranking.put('2', 2);
        ranking.put('3', 3);
        ranking.put('4', 4);
        ranking.put('5', 5);
        ranking.put('6', 6);
        ranking.put('7', 7);
        ranking.put('8', 8);
        ranking.put('9', 9);
        ranking.put('T', 10);
        ranking.put('J', 11);
        ranking.put('Q', 12);
        ranking.put('K', 13);
        ranking.put('A', 14);

        char[] allecsCards = A.toCharArray();
        char[] bobsCards = B.toCharArray();
        int allecWins = 0;
        for(int i= 0; i < allecsCards.length; i++){
            char allec = allecsCards[i];
            int allecRank = ranking.get(allec);
            char bob = bobsCards[i];
            int bobRank = ranking.get(bob);
            if(allecRank>bobRank) allecWins++;

        }

        return allecWins;
    }

    public class Card{
        String name;
        String symbol;
        int rank;

        public Card(String name, String symbol, int rank) {
            this.name = name;
            this.symbol = symbol;
            this.rank = rank;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
    }
}

