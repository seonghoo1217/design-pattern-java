# Template Method Pattern 요구사항

1. 시민들 중 마린이 될 수 있는 조건의 시민을 징집한다.
   - conscriptionCitizen():Citizen

2. 징집된 군인들을 훈련한다.
   - traning(Citizen):void
   
3. 보직을 시민에서 병사로 변경
   - changeOfPosition(Citizen citizen):Soldier
   
4. 장비를 보급한다.
   - supplyEquipment(Solder soldier);

> **요구사항정리** : 요구사항을 보면 시민들을 대상으로 징집이라는 행위를 통해 병사로 만들라는 요구사항 입니다. 
그리고 시민을 징집해 병사로 만들기 위해선 순차적인 단계를 거쳐야합니다.
또한 각 과정들은(process) 수정 및 추가 될 수 있습니다.
