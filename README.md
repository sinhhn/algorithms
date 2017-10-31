# Algorithms
## Giải thuật sort
### Insertion Sort
1. Thuật toán

	Ý tưởng cơ bản của giải thuật này cũng giống như chơi bài. Người chơi sẽ rút lần lượt từ quân thứ 2 và so với các con bài trước nó để chèn vào vị trí thích hợp.
	
	![insertion sort](https://goo.gl/aFH1kj)

	```
	for(int i = 1; i < n; i++) {
		for(int j = i; j > 0 && a[j] < a[j-1]; j++) {
			swap(a, j, j - 1);
		}
	}
	```
	
2. Độ phức tạp
O(logn)
	Thuật toán insertion sort sử dụng *n^2 / 2* phép so sánh và *n^2 / 2* phép hoán vị. Độ phức tạp của thuật toán này là O(n^2)

### Selection Sort
1. Thuật toán

	Thuật toán này có tư tưởng rất đơn giản. Chọn phần tử nhỏ nhất đưa vào vị trí đầu tiên. Tiếp theo chọn phần tử nhỏ thứ 2 đưa vào vị trí thứ 2. Tiếp tục như thế cho đến khi dãy được sắp xếp.

	![Selection Sort](https://goo.gl/gchQRu)
	
	```
	for(int i = 0; i < n; i++) {
		int min = i;
		for(int j = i+1; j < n; j++) {
			if(a[j] < a[min]) {
				swap(a, i, j);
			}	
		}
	}
	```

2. Độ phức tạp

	Tại phần tử thứ *i* ta luôn có *n-i* phép so sánh. Vì vậy tổng số phép so sánh sẽ là: *(n-1) + (n-2) + .... + 1 = 3(n-1)n / 2*. Vậy độ phức tạp của thuật toán là O(n^2).		

	

### Quick Sort
1. Thuật toán

	Đây là thuật toán nổi tiếng nhất trong các thuật toán cơ bản. 
	
	![Quicksort](https://goo.gl/3AdjtN)
2. Độ phức tạp

### Merge Sort
Độ phức tạp O(logn)
### Heap Sort
Độ phức tạp O(logn)
