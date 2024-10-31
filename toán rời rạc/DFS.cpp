#include <iostream>
#include <vector>
#include <stack>

using namespace std;

// Hàm thực hiện DFS
void DFS(int start, vector<vector<int>>& graph, vector<bool>& visited) {
    stack<int> s; // Khởi tạo stack để lưu trữ các đỉnh cần duyệt
    s.push(start); // Đưa đỉnh bắt đầu vào stack

    while (!s.empty()) {
        int current = s.top(); // Lấy đỉnh ở đỉnh stack
        s.pop(); // Xóa đỉnh khỏi stack

        if (!visited[current]) { // Kiểm tra nếu đỉnh chưa được truy cập
            visited[current] = true; // Đánh dấu đỉnh đã được truy cập
            cout << current << " "; // In ra đỉnh

            // Duyệt tất cả các đỉnh kề với đỉnh hiện tại
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) { // Nếu đỉnh kề chưa được truy cập
                    s.push(neighbor); // Thêm vào stack
                }
            }
        }
    }
}

int main() {
    int numVertices = 5; // Số lượng đỉnh
    vector<vector<int>> graph(numVertices); // Khởi tạo đồ thị dưới dạng danh sách kề

    // Khởi tạo đồ thị (mỗi cặp dưới đây đại diện cho một cạnh)
    graph[0] = {1, 2}; // Đỉnh 0 kết nối với 1 và 2
    graph[1] = {0, 3}; // Đỉnh 1 kết nối với 0 và 3
    graph[2] = {0, 4}; // Đỉnh 2 kết nối với 0 và 4
    graph[3] = {1};     // Đỉnh 3 kết nối với 1
    graph[4] = {2};     // Đỉnh 4 kết nối với 2

    vector<bool> visited(numVertices, false); // Mảng để đánh dấu các đỉnh đã truy cập

    cout << "Kết quả duyệt đồ thị theo DFS: ";
    DFS(0, graph, visited); // Gọi hàm DFS bắt đầu từ đỉnh 0
    cout << endl;

    return 0;
}
