/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rx_learn.chapter_1;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author webprog26
 */
public class Launcher {
    
    public static void launch() {
        final Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma",
                "Delta", "Epsilon");
        
        myStrings.map((s) -> s.length()).subscribe((s) -> System.out.println(s));
    }
    
    public static void launchWithInterval(final long intervalInMillis) {
        final Observable<Long> intervals = Observable.interval(intervalInMillis, TimeUnit.SECONDS);
        
        intervals.subscribe(s -> System.out.println(s));
        sleep();
    }
    
    private static void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
