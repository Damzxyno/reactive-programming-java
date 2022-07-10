package com.damzxyno.javareactiveprogramming.multithreading;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class PersonService {
    public void savePersons(List<Person> personList) {
        CompletableFuture<Boolean> save1 = save(personList, 1, 500);
        CompletableFuture<Boolean> save2 = save(personList, 1, 500);
    }

    @Async
    public CompletableFuture<Boolean> save(List<Person> personList, int i, int j) {
        System.out.println("Ended Thread, name : " + Thread.currentThread().getName());
        for(int k = i; k< j; k++){
            Person p = personList.get(k);
            System.out.println(p);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return CompletableFuture.completedFuture(true);
    }
}
