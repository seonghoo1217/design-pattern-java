## 싱글톤 패턴 정의

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e59c52fc-671f-40dd-9ebb-0887a5c03c7b/Untitled.png)

싱글톤 패턴의 단순정의는 객체의 인스턴스의 생성을 **오로지 1개만** 보장하는 패턴을 의미한다.

보통 객체를 새로 생성하기 위해선 자바의 `new` 예약어를 통해 인스턴스를 생성하여 사용한다.

예를 들어 new를 통해 A라는 클래스를 10번호출 할경우 A라는 인스턴스는 총 10개가 생성되는 것이다.

하지만 하나의 인스턴스만을 보장받아 사용해야하는 경우가 있다. 예를 들어 공동이 사용하는 자원에 관하여 필요한 시점마다 계속 new를 통해 인스턴스를 생성하게 된다면 해당 자원의 관리는 어려워질뿐아니라 의미 자체가 사라지게 된다.

이런 경우에 우리는 싱글톤 패턴을 사용하여 1개의 인스턴스만을 사용한다.

**혹시 `new`를 한번만 호출하여 객체를 1개만 생성한다면?**

이라는 발상을 다들 한번은 해보았을 수 있지만 이것이 해당 인스턴스가 1개만 존재한다는 것을 `**보증`** 해줄수는 없다.

## 싱글톤 패턴의 사용 이유

한개의 인스턴스만을 보장받아 얻는 이점은 과연 무엇인가?

우선적으로 메모리 측면에서 이점을 볼 수 있다. 이는 당연한 결과로 최초 한번의 `new` 를 통해 생성된 객체를 고정된 메모리 영역에서 사용하고 추후 해당객체에 대한 작업을 통할때 이미 생성한 객체에 접근하기에 메모리의 손실을 최소화할 수 있다.

부가적으로 이미 생성한 객체에 접근하기에 속도적인 측면에서도 이점을 얻을 수 있다.

또다른 이점으로는 다른 객체간에 데이터 공유가 쉽다는 것이다. 싱글톤 인스턴스가 전역으로 사용되는 인스턴스이기 때문에 다른 클래스의 인스턴스가 접근하여 사용 할 수 있다.

하지만 이의 문제는 동시성문제로 이어지게 되는데 이점을 유의하여 사용하여야한다.

### 싱글톤 패턴의 문제점

싱글톤 패턴은 위에서 말한 이점들을 가질 수 있지만 많은 문제점 또한 수반하기에 `trade-off` 를 잘고려하여야한다.

**먼저 싱글톤 패턴을 구현하는 코드 자체가 많이 필요하다**. 예제 코드의 방법외에도 **정적 팩토리 메소드**에서 객체의 생성을 확인하고 생성자를 호출하는 경우에 **멀티스레딩 환경**에서 발생할 수 있는 동시성 문제를 해결하기 위해 **syncronized** 키워드를 사용해야한다.

**두번째로는** 테스트가 어렵다. 싱글톤 인스턴스는 자원을 공유하기 때문에 테스트가 결정적으로 격리된 환경에서 수행되기 위해선 인스턴스는 매번 초기화되어 새상태를 보장받아야한다.

그렇지않다면 어플리케이션 전역에서 상태를 공유하기 때문에 테스트가 온전하게 수행되지 못한다.

**세번째로는** 의존 관계상 클라이언트가 구현체 클래스에 의존적이게 된다. new 키워드를 직접 사용하여 클래스 안에서 직접 객체를 생성하고 있으므로, 이는 SOLID 원칙 중 DIP를 위배하게되고 OCP 원칙 또한 위반할 가능성이 높다.

### 결론

오직 한 개의 인스턴스 생성을 보증하여 효율을 찾을 수 있지만 그에 못지많게 수반되는 문제점도 많다. 싱글톤 패턴은 안티패턴으로 불릴 만큼 단독으로 사용한다면 객체 지향에 위반되는 사례가 많다. 스프링 컨테이너 같은 프레임워크의 도움을 받으면 싱글톤 패턴의 문제점들을 보완하면서 장점의 혜택을 누릴 수 있다. 실제로 스프링 빈은 컨테이너의 도움을 받아 싱글톤 스콥으로 관리되고 있다.

프레임워크 도움없이 싱글톤 패턴을 적용하고 싶다면, 위에서 살펴본 장단점의 trade-off를 잘 고려하여 사용하는 것이 좋을 것이다.

>> [출처]([https://tecoble.techcourse.co.kr/post/2020-11-07-singleton/](https://tecoble.techcourse.co.kr/post/2020-11-07-singleton/))