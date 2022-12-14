## 브릿지 패턴의 정의

- 객체의 확장성을 향상하기 위한 패턴으로, 객체에서 동작을 처리하는 구현부와 확장을 위한 추상부를 분리한다.
- 기능을 처리하는 클래스와 구현을 담당하는 추상 클래스로 구별한다. 구현뿐 아니라 추상화도 독립적 변경이 필요할 때 브리지 패턴을 사용한다.
- 추상화 객체와 구현 객체는 분리되어야하며 매우 독립적으로 동작하여야한다.
- 브릿지 패턴은 기존 시스템에 부수적인 새로운 기능들을 지속적으로 추가할 때 유용
- 브릿지 패턴은 새로운 인터페이스를 정의하여 **기존 프로그램의 변경없이 확장이 가능**

### 브릿지 패턴 사용처

- 부모 추상클래스가 기본 규칙 세트를 정의하고 구체적인 클래스가 추가 규칙을 추가하고 싶은 경우
- 객체에 대한 참조가 있는 추상클래스가 있고 각 구체적인 클래스에서 정의될 추상 메소드가 있는 경우

### 브릿지 패턴 클래스 다이어그램

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/10201b44-4ac7-4b89-a2b8-5e8fc04833c5/Untitled.png)

- **Implementor**
    - abstract 기능을 구현하기 위한 Interface 정의
- ConcreateImplementor
    - 실제 기능 구현
- Abstract
    - 기능 계층의 최하위 클래스
    - 구현 부분에 해당하는 클래스를 인스턴스를 가지고 구현부 메서드를 호출한다.
- RefinedAbstract
    - 기능 계층에서 새로운 부분을 확장한 클래스