package com.teamtreehouse;

import com.teamtreehouse.model.SongBook;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Imortist on 22/04/2017.
 */
class KaraokeMachineTest {
    @BeforeEach
    void setUp() {
        SongBook songBook = new SongBook();
        KaraokeMachine karaoke = new KaraokeMachine(songBook);
    }

    public void ifTHereIsNoSongsInSongBook(){

    }

}