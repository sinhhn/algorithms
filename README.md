# Algorithms
## Giải thuật sort
### Selection Sort
Ý tưởng của giải thuật này là chọn ra phần tử bé nhất xếp vào đầu tiên và tiếp tục như thế cho đế hết.
Giả mã:

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