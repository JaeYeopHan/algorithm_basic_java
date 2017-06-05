# Algorithm_basic
기본적인 알고리즘을 정리한 Repository 입니다. 모든 코드는 `test` 디렉토리에 존재하며 주제별로 나뉘어 있습니다. 알고리즘 코드들은 java로 작성되었습니다

</br>

## Algorithm basic List

### Basic part
* 주어진 문자열을 int 형으로 변환한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/StringParseToInt.java)
* 주어진 문자열을 역순으로 출력한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/StringReverse.java)
* 주어진 문자열에서 문자열을 구성하고 있는 각각의 문자열들이 고유한지를 판단한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/UniqueCharacterInString.java)
* 주어진 문자열이 애너그램인지를 판단한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/IsAnagram.java)
* 주어진 문자열을 길이와 함께 적어주면서 압축을 한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/CharacterCompressWithLength.java)
* 주어진 문서(단어별로 나뉘어진 배열)에서 특정 단어의 빈도를 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/FrequencyStringInDocument.java)
* 주어진 수보다 작은 소수의 개수를 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/FindPrimeNumTest.java)

### Basic Math
* 주어진 두 수의 최대 공약수와 최소 공배수를 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basic/GcdAndGcm.java)
* n개의 서로 다른 원소 중 r개의 원소를 순서없이 선택하는 방법의 수를 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/basicMath/BasicCombination.java)

### Recursion part
* Fibonacci 를 계산하는 함수를 작성한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/recursion/Fibonacci.java)
  * Dynamic Programming Fibonacci. [code](https://github.com/JaeYeopHan/algorithm_basic_java/tree/master/src/test/java/algorithm/dp)
* 주사위로 이동 가능한 경우의 수를 모두 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/recursion/Dice.java)
* n비트의 모든 경우의 수를 출력한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/recursion/NBitWays.java)
* 순열을 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/recursion/Permutation.java)
* N개 괄호로 만들 수 있는 모든 조합 출력하기. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/algorithm/recursion/BraceCombination.java)

---

## DataStructure
### LinkedList
* 첫번째 원소를 제거한다.
* 중복된 원소를 제거한다.
* 역순으로 출력한다.
* k번째 원소를 찾는다.
* 회문인지 판단한다.  
[code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/codeedlist/SinglecodeedListTest.java)

### Stack
* Array를 사용하여 Stack을 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/stack/MyStackWithArrayTest.java)
* ArrayList를 사용하여 Stack을 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/stack/MyStackWithArrayListTest.java)
* Stack에 저장된 값들 중 최소값을 반환하는 minStack() 함수를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/stack/MinimumStackTest.java)
* Stack 자료구조를 사용하여 회문을 판별한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/stack/IsPalindromeTest.java)

### Queue
* Stack을 사용하여 queue를 stack처럼 만든다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/queue/ReverseQueueTest.java)
* Stack 두 개로 Queue를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/queue/QueueWithTwoStack.java)

### BinaryTree
* 바이너리 트리에서 최대값을 구한다.
* 주어진 바이너리 트리가 균형 잡힌 트리인지 판별한다.
* 오름차순으로 정렬된 배열을 Binary Search Tree로 변환한다.
* 주어진 트리가 BST인지 확인한다.  
[code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/binaryTree/BinaryTree.java)

### Priority Queue
* Priority queue를 사용하여 heap sort를 하라. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/priorityqueue/HeapSortByUsingPQ.java)
* 많은 수 중 top 10을 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/datastructure/priorityqueue/CalcTopTen.java)

---

## Algorithm
### Sort
* bubble sort를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/sort/BubbleSort.java)
* Insertion sort를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/sort/InsertionSort.java)
* Selection sort를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/sort/SelectionSort.java)
* Quick sort를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/sort/QuickSort.java)
* radix sort를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/sort/RadixSort.java)

### Search
* binary search를 사용하여 O(log n)의 시간복잡도로 target을 찾는다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/search/BinarySearchTest.java) 
* 정렬된 2차원 배열에서 검색한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/search/SearchIn2DTest.java)

### bit
* 2의 제곱수인지 판별한다.
* 두 수에서 다른 비트의 개수를 구한다.  
[code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/bit/BitOperator.java)
* O(1)으로 해당 데이터가 존재하는지 판단한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/bit/BitMapTest.java)

---
</br>

## 알고리즘 문제 풀어보기
### Codility exercise
* 양 쪽의 합이 동일해지는 index의 값을 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/codility/SearchEquilibrium.java)

### Others
* n!의 결과값에서 0의 개수를 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/exercise/FactorialZeroCount.java)
* temp 를 사용하지 않고 두 변수를 swap 한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/exercise/NoTempSwapTest.java)
* 어느날의 월, 일을 입력받아 요일을 반환하는 함수를 구현한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/exercise/CalenderExample.java)
* 주어진 배열에서 합이 최대가 되는 sub array의 합을 구한다. [code](https://github.com/JaeYeopHan/algorithm_basic_java/blob/master/src/test/java/exercise/FindMaxSumInArray.java)

</br>

## LICENSE
<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="크리에이티브 커먼즈 라이선스" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a>

