package com.oreilly.chapter_2.Game;

/*
Игра предусматривает один игровой объект и три обекта-игрока. Генерируются случайные числа от 0 до 9, а три объекта-
игрока пытаются их угадать.

Это точка, из которой стартует приложение. он содержит метод main.
В методе main() создается объект GuessGame, из которого вызывается метод startGame();
В методое startGame() объекта GuessGame происходит весь игровой процесс. Он создает трёх игроков, затем "придумывает"
случайные числа, которые игроки должны угадывать. После того как каждого из игроков просят угадать число, проверяется
результат и либо выводится информация о победителях, либо игроков просят угадать еще раз.
*/

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
