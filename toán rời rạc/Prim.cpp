#include <iostream>
#include <vector>
#include <climits>

using namespace std;

// Định nghĩa số đỉnh của đồ thị
#define V 5

// Hàm tìm đỉnh có trọng số nhỏ nhất trong tập đỉnh chưa có trong MST
int minKey(int key[], bool mstSet[]) {
    int min = INT_MAX, min_index;

    // Duyệt qua tất cả các đỉnh để tìm đỉnh có key nhỏ nhất
    for (int v = 0; v < V; v++) {
        // Nếu đỉnh chưa có trong MST và key của nó nhỏ hơn min
        if (!mstSet[v] && key[v] < min) {
            min = key[v];
            min_index = v; // Cập nhật chỉ số của đỉnh có key nhỏ nhất
        }
    }
    return min_index; // Trả về chỉ số của đỉnh có key nhỏ nhất
}

// Hàm cài đặt giải thuật Prim để tìm cây khung tối thiểu
void primMST(int graph[V][V]) {
    int parent[V]; // Mảng lưu trữ cây khung
    int key[V];    // Mảng lưu trữ trọng số nhỏ nhất cho mỗi đỉnh
    bool mstSet[V]; // Mảng đánh dấu các đỉnh đã có trong MST

    // Khởi tạo tất cả key bằng vô cực và mstSet bằng false
    for (int i = 0; i < V; i++) {
        key[i] = INT_MAX; // Khởi tạo trọng số cho mỗi đỉnh
        mstSet[i] = false; // Đánh dấu tất cả các đỉnh chưa có trong MST
    }

    // Khởi tạo key của đỉnh đầu tiên
    key[0] = 0;   
    parent[0] = -1; // Đỉnh đầu tiên là gốc (không có cha)

    // Tìm V-1 cạnh trong MST
    for (int count = 0; count < V - 1; count++) {
        // Chọn đỉnh có trọng số nhỏ nhất từ tập đỉnh chưa bao gồm trong MST
        int u = minKey(key, mstSet);
        
        // Đánh dấu đỉnh này là đã được thêm vào MST
        mstSet[u] = true;

        // Cập nhật key và parent của các đỉnh lân cận
        for (int v = 0; v < V; v++) {
            // Nếu có cạnh giữa u và v, v chưa có trong MST và trọng số của cạnh nhỏ hơn key[v]
            if (graph[u][v] && !mstSet[v] && graph[u][v] < key[v]) {
                parent[v] = u; // Cập nhật cha của v
                key[v] = graph[u][v]; // Cập nhật trọng số nhỏ nhất cho v
            }
        }
    }

    // In ra các cạnh trong cây khung tối thiểu
    cout << "Cây khung tối thiểu chứa các cạnh:\n";
    for (int i = 1; i < V; i++) {
        cout << "Đỉnh " << parent[i] << " - Đỉnh " << i << " có trọng số: " << graph[i][parent[i]] << endl;
    }
}

int main() {
    // Ma trận trọng số của đồ thị (0 nếu không có cạnh giữa hai đỉnh)
    int graph[V][V] = {
        {0, 2, 0, 6, 0},
        {2, 0, 3, 8, 5},
        {0, 3, 0, 0, 7},
        {6, 8, 0, 0, 9},
        {0, 5, 7, 9, 0}
    };

    // Gọi hàm Prim để tìm cây khung tối thiểu
    primMST(graph);

    return 0; // Kết thúc chương trình
}
