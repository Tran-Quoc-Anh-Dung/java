#include <iostream>
#include <vector>
#include <queue>

using namespace std;

// Hàm kiểm tra tính liên thông của đồ thị
bool isConnected(const vector<vector<int>>& graph, int V) {
    vector<bool> visited(V, false); // Mảng đánh dấu các đỉnh đã được thăm
    queue<int> q; // Hàng đợi cho thuật toán BFS

    // Bắt đầu từ đỉnh đầu tiên (đỉnh 0)
    visited[0] = true;
    q.push(0); // Thêm đỉnh 0 vào hàng đợi

    // Thực hiện BFS
    while (!q.empty()) {
        int u = q.front(); // Lấy đỉnh đầu hàng
        q.pop(); // Loại bỏ đỉnh khỏi hàng

        // Duyệt tất cả các đỉnh kề với đỉnh u
        for (int v : graph[u]) {
            if (!visited[v]) { // Nếu đỉnh v chưa được thăm
                visited[v] = true; // Đánh dấu là đã thăm
                q.push(v); // Thêm v vào hàng đợi
            }
        }
    }

    // Kiểm tra xem tất cả các đỉnh có được thăm không
    for (bool v : visited) {
        if (!v) return false; // Nếu có đỉnh chưa thăm, đồ thị không liên thông
    }
    return true; // Đồ thị liên thông
}

// Hàm kiểm tra số lượng đỉnh có bậc lẻ
bool checkEulerian(const vector<vector<int>>& graph, int V) {
    int oddDegreeCount = 0; // Đếm số đỉnh có bậc lẻ

    // Duyệt từng đỉnh trong đồ thị
    for (int i = 0; i < V; i++) {
        int degree = graph[i].size(); // Tính bậc của đỉnh i
        if (degree % 2 != 0) { // Nếu bậc lẻ
            oddDegreeCount++; // Tăng biến đếm
        }
    }

    // Điều kiện để là đồ thị Euler:
    // Có 0 hoặc 2 đỉnh có bậc lẻ
    return (oddDegreeCount == 0 || oddDegreeCount == 2);
}

int main() {
    int V, E;
    cout << "Nhap so dinh (V): "; // Nhập số lượng đỉnh
    cin >> V;
    cout << "Nhap so canh (E): "; // Nhập số lượng cạnh
    cin >> E;

    // Khởi tạo đồ thị dưới dạng danh sách kề
    vector<vector<int>> graph(V);

    cout << "Nhap cac canh (u, v): " << endl;
    // Nhập các cạnh của đồ thị
    for (int i = 0; i < E; i++) {
        int u, v;
        cin >> u >> v; // Nhập 2 đỉnh u và v cho một cạnh
        graph[u].push_back(v); // Thêm v vào danh sách kề của u
        graph[v].push_back(u); // Thêm u vào danh sách kề của v (đồ thị vô hướng)
    }

    // Kiểm tra tính liên thông của đồ thị
    if (!isConnected(graph, V)) {
        cout << "Do thi khong lien thong." << endl; // Nếu không liên thông
        return 0; // Kết thúc chương trình
    }

    // Kiểm tra điều kiện Euler
    if (checkEulerian(graph, V)) {
        cout << "Do thi la do thi Euler." << endl; // Nếu là đồ thị Euler
    } else {
        cout << "Do thi khong la do thi Euler." << endl; // Nếu không phải là đồ thị Euler
    }

    return 0; // Kết thúc chương trình
}
