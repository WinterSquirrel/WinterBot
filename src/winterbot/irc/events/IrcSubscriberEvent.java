/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterbot.irc.events;

import winterbot.events.Event;
import winterbot.events.EventType;

/**
 *
 * @author Fred
 */
public class IrcSubscriberEvent extends IrcEvent{
    public final String subscriberName;
    public final int monthsSubbed;
    public IrcSubscriberEvent(EventType type,String channel,String subName) {
        this(type,channel,subName,0);
        
        
    }
    public IrcSubscriberEvent(EventType type,String channel,String subName,int monthsSubbed)
    {
        super(type,channel);
        this.subscriberName=subName;
        this.monthsSubbed = monthsSubbed;
    }
    
}
