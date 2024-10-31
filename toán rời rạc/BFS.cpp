#include <iostream>
#include <vector>
#include <queue>

using namespace std;

// Hàm để thêm cạnh vào đồ thị
void addEdge(vector<vector<int>>& adj, int u, int v) {
    adj[u].push_back(v); // Thêm đỉnh v vào danh sách kề của đỉnh u
    adj[v].push_back(u); // Thêm đỉnh u vào danh sách kề của đỉnh v (đồ thị vô hướng)
}

// Hàm duyệt đồ thị bằng BFS
void BFS(const vector<vector<int>>& adj, int start) {
    vector<bool> visited(adj.size(), false); // Mảng để đánh dấu các đỉnh đã duyệt
    queue<int> q; // Hàng đợi để lưu các đỉnh sẽ được duyệt

    visited[start] = true; // Đánh dấu đỉnh bắt đầu là đã duyệt
    q.push(start); // Thêm đỉnh bắt đầu vào hàng đợi

    while (!q.empty()) { // Duyệt khi hàng đợi không rỗng
        int node = q.front(); // Lấy đỉnh đầu hàng đợi
        q.pop(); // Xóa đỉnh đầu khỏi hàng đợi
        cout << node << " "; // Xử lý đỉnh (in ra)

        // Duyệt qua tất cả các đỉnh kề
        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) { // Nếu đỉnh kề chưa được duyệt
                visited[neighbor] = true; // Đánh dấu là đã duyệt
                q.push(neighbor); // Thêm đỉnh kề vào hàng đợi
            }
        }
    }
}

int main() {
    int vertices = 6; // Số đỉnh của đồ thị
    vector<vector<int>> adj(vertices); // Khởi tạo danh sách kề

    // Thêm các cạnh vào đồ thị
    addEdge(adj, 0, 1);
    addEdge(adj, 0, 2);
    addEdge(adj, 1, 3);
    addEdge(adj, 1, 4);
    addEdge(adj, 2, 5);

    cout << "Duyệt đồ thị bằng BFS từ đỉnh 0: ";
    BFS(adj, 0); // Gọi hàm BFS từ đỉnh 0
    cout << endl;

    return 0; // Kết thúc chương trình
}
