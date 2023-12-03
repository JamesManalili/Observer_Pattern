# Problem: Real-time News Subscription Service

__Background:__ You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.

__Scenario Description:__ The system comprises two main components: __NewsAgency__ and __Subscriber.__
- __NewsAgency:__ Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.
- __Subscriber:__ Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.

__Requirements:__
__1. Subscription Management:__
- Users should be able to subscribe to the news service.
- Subscribers should be notified promptly when new news is published.

__2. Dynamic Subscription Updates:__
- The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.

__3. Decoupled Communication:__
- Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.

__Expect Behavior:__
- When the news agency publishes breaking news, all subscribed users should receive immediate updates.
- Subscribers can join or leave the service without affecting the delivery of news to other subscribers.
- The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.

__Constraints:__
- The system should be scalable to handle a growing number of subscribers without compromising performance.
- Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.

# UML Class Diagram
![ObserverPatternUML](https://github.com/JamesManalili/Observer_Pattern/assets/142465145/8a600cee-5de0-4579-a151-20929102f92e)



