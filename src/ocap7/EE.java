package ocap7;


class Game{ }
class Cricket extends Game{ }
class Instrument{ }
class Guitar extends Instrument{ }
interface Player<E>{ void play(E e); }
interface GamePlayer<E extends Game> extends Player<E>{ }

/*class Batsman implements GamePlayer<Cricket>{
    public void play(Game o){ }
}*/


