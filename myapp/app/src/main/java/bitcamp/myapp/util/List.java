package bitcamp.myapp.util;

// 데이터 목록을 다루는 일을 할 객체의 사용법
// => 즉 '그 객체에게 일을 시킬 때 다음의 메서드를 호출하여 일을 시켜라.' 라고 지정하는 문법
public interface List<T> {

  // 데이터를 더할 때 호출할 메서드
  void add(T value); // 규칙이기 때문에 메서드의 시그너처만 정의한다.

  T remove(int index);

  boolean remove(T value);
  
  T get(int index);

  int indexOf(T value);

  Object[] toArray();

  int size();

  boolean contains(T value);

  Iterator iterator();
}
