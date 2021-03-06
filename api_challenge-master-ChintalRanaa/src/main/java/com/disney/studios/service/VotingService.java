package com.disney.studios.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.disney.studios.dao.DogRepository;
import com.disney.studios.domain.Dog;
import com.disney.studios.VoterWatcher;

/**
 * This Service is for Voting.
 */
@Service
public class VotingService {

    @Autowired
    DogRepository dogRepository;

    @Autowired
    VoterWatcher voterWatcher;

    /**
     * This will allow to vote on a picture and
     * @return true/false whether voting was allowed and completed or not.
     */
    public boolean vote(long id, boolean voteUp, String client) {

        if (voterWatcher.addClient(id, client)) {
            Dog dog = dogRepository.findOne(id);

            if (voteUp) dog.incrementVote();
            else dog.decrementVote();

            dogRepository.save(dog);
            return true;
        }
        return false;
    }
}