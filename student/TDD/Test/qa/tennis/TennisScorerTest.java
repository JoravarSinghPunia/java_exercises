package qa.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisScorerTest {
    @Test
    public void initial_score_0_0(){
        TennisScorer t = new TennisScorer();
        assertEquals("0:0", t.currentScore());
    }
    @Test
    public void player_a_wins_first_point(){
        TennisScorer t = new TennisScorer();
        t.winningPoints("A");
        assertEquals("15:0", t.currentScore());
    }
    @Test
    public void player_a_wins_second_point(){
        TennisScorer t = new TennisScorer();
        t.winningPoints("AA");
        assertEquals("30:0", t.currentScore());
    }
    @Test
    public void player_a_wins_third_point(){
        TennisScorer t = new TennisScorer();
        t.winningPoints("AAA");
        assertEquals("40:0", t.currentScore());
    }
    @Test
    public void player_b_wins_first_point(){
        TennisScorer t = new TennisScorer();
        t.winningPoints("B");
        assertEquals("0:15", t.currentScore());
    }
    @Test
    public void player_b_wins_second_point(){
        TennisScorer t = new TennisScorer();
        t.winningPoints("BB");
        assertEquals("0:30", t.currentScore());
    }
    @Test
    public void player_b_wins_third_point(){
        TennisScorer t = new TennisScorer();
        t.winningPoints("BBB");
        assertEquals("0:40", t.currentScore());
    }
    @Test
    void test_player_A_wins_deuce_point() {
        TennisScorer t = new TennisScorer();
        t.winningPoints("ABABABA");
        assertEquals("A:40", t.currentScore());
    }

    @Test
    void test_player_B_wins_deuce_point() {
        TennisScorer t = new TennisScorer();
        t.winningPoints("ABABABB");
        assertEquals("40:A", t.currentScore());
    }

    @Test
    void test_player_A_wins_game_point() {
        TennisScorer t = new TennisScorer();
        t.winningPoints("AAAA");
        assertEquals("0:0", t.currentScore());
    }

    @Test
    void test_player_B_wins_game_point() {
        TennisScorer t = new TennisScorer();
        t.winningPoints("BBBB");
        assertEquals("0:0", t.currentScore());
    }
}