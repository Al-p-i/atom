package ru.atom.model;

import ru.atom.model.actor.Actor;
import ru.atom.model.actor.Tickable;

import java.util.Collection;

/**
 * Created by sergey on 2/2/17.
 */
public class World implements Tickable {
    private Collection<Actor> actors;


    @Override
    public void tick(long time) {
        actors.forEach(x -> x.tick(time));
    }
}