/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerimpl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flavi
 */
public class Observable<T> {
    
    private T data;
    List<Subscriber> channel = new ArrayList<>();
    
    void subscribe(Subscriber subscriber) {
        this.channel.add(subscriber);
    }
        
    void update(T data) {
        this.channel.stream().forEach(sub -> sub.update(data));
    }
}
