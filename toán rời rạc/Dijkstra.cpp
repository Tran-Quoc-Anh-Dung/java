#include <iostream>
#include <vector>
#include <queue>
#include <limits>

using namespace std;

// Định nghĩa giá trị vô cực
const int INF = numeric_limits<int>::max();

// Lớp đồ thị
class Graph {
public:
    Graph(int vertices); // Khởi tạo đồ thị với số đỉnh
    void addEdge(int u, int v, int weight); // Thêm cạnh
    void dijkstra(int start); // Giải thuật Dijkstra

private:
    int vertices; // Số đỉnh
    vector<vector<pair<int, int>>> adj; // Danh sách kề
};

// Hàm khởi tạo đồ thị
Graph::Graph(int vertices) {
    this->vertices = vertices;
    adj.resize(vertices); // Khởi tạo danh sách kề với số đỉnh
}

// Hàm thêm cạnh vào đồ thị
void Graph::addEdge(int u, int v, int weight) {
    adj[u].emplace_back(v, weight); // Thêm cạnh từ u đến v
    adj[v].emplace_back(u, weight); // Thêm cạnh từ v đến u (nếu đồ thị vô hướng)
}

// Hàm thực hiện giải thuật Dijkstra
void Graph::dijkstra(int start) {
    // Khởi tạo khoảng cách đến các đỉnh với giá trị vô cực
    vector<int> distance(vertices, INF);
    // Hàng đợi ưu tiên để lưu trữ các đỉnh cần xử lý
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;

    distance[start] = 0; // Khoảng cách từ đỉnh bắt đầu đến chính nó là 0
    pq.emplace(0, start); // Thêm đỉnh bắt đầu vào hàng đợi

    // Vòng lặp chính của giải thuật
    while (!pq.empty()) {
        int current = pq.top().second; // Đỉnh hiện tại
        int currentDistance = pq.top().first; // Khoảng cách đến đỉnh hiện tại
        pq.pop(); // Lấy đỉnh có khoảng cách ngắn nhất ra khỏi hàng đợi

        // Nếu khoảng cách hiện tại lớn hơn khoảng cách đã tìm thấy, bỏ qua
        if (currentDistance > distance[current]) {
            continue;
        }

        // Xử lý các đỉnh kề với đỉnh hiện tại
        for (const auto& edge : adj[current]) {
            int neighbor = edge.first; // Đỉnh kề
            int weight = edge.second; // Trọng số cạnh
            int newDistance = currentDistance + weight; // Tính khoảng cách mới

            // Nếu khoảng cách mới ngắn hơn, cập nhật và thêm vào hàng đợi
            if (newDistance < distance[neighbor]) {
                distance[neighbor] = newDistance;
                pq.emplace(newDistance, neighbor);
            }
        }
    }

    // In ra khoảng cách ngắn nhất từ đỉnh bắt đầu đến các đỉnh khác
    for (int i = 0; i < vertices; ++i) {
        if (distance[i] == INF) {
            cout << "Khoảng cách từ " << start << " đến " << i << " là VÔ CỰC" << endl;
        } else {
            cout << "Khoảng cách từ " << start << " đến " << i << " là " << distance[i] << endl;
        }
    }
}

// Hàm main
int main() {
    int vertices, edges; // Số đỉnh và số cạnh
    cout << "Nhập số lượng đỉnh: ";
    cin >> vertices;
    cout << "Nhập số lượng cạnh: ";
    cin >> edges;

    Graph g(vertices); // Khởi tạo đồ thị

    cout << "Nhập các cạnh (u, v, trọng số):" << endl;
    for (int i = 0; i < edges; ++i) {
        int u, v, weight;
        cin >> u >> v >> weight; // Nhập thông tin các cạnh
        g.addEdge(u, v, weight); // Thêm cạnh vào đồ thị
    }

    int start;
    cout << "Nhập đỉnh bắt đầu: ";
    cin >> start;

    g.dijkstra(start); // Gọi hàm Dijkstra

    return 0; // Kết thúc chương trình
}
