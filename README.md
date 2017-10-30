# Algorithms
## Giải thuật sort
### Selection Sort
Ý tưởng của giải thuật này là chọn ra phần tử bé nhất xếp vào đầu tiên và tiếp tục như thế cho đế hết.
![Selection Sort](http://codepumpkin.com/wp-content/uploads/2017/10/SelectionSort_Avg_case.gif)

```
for(int i = 0; i < n; i++) {
	int min = i;
	for(int j = i + 1; j < n; j++) {
		if(a[j] < a[min]) {
			min = j;
		}
	}
	if(min != i) {
		swap(a, i, j);
	}
}
```

### Insertion Sort
Ý tưởng cơ bản của giải thuật này là chọn số bé nhất insert vào đầu

![insertion sort](https://upload.wikimedia.org/wikipedia/commons/9/9c/Insertion-sort-example.gif)

```
for(int i = 1; i < n; i++) {
	for(int j = i; j > 0 && a[j] < a[j-1]; j++) {
		swap(a, j, j - 1);
	}
}
```