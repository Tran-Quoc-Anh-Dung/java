#include <iostream>
#include <vector>
#include <limits>

using namespace std;

// Cấu trúc để đại diện cho một cạnh trong đồ thị
struct Edge {
    int source;      // Đỉnh nguồn
    int destination; // Đỉnh đích
    int weight;      // Trọng số của cạnh
};

// Lớp biểu diễn đồ thị
class Graph {
public:
    int V; // Số đỉnh
    int E; // Số cạnh
    vector<Edge> edges; // Danh sách các cạnh

    // Hàm khởi tạo đồ thị
    Graph(int V, int E) {
        this->V = V;
        this->E = E;
        edges.resize(E);
    }

    // Hàm thêm cạnh vào đồ thị
    void addEdge(int i, int src, int dest, int weight) {
        edges[i].source = src;
        edges[i].destination = dest;
        edges[i].weight = weight;
    }

    // Hàm thực hiện giải thuật Bellman-Ford
    void bellmanFord(int src) {
        // Khởi tạo khoảng cách từ đỉnh nguồn đến tất cả các đỉnh
        vector<int> distance(V, numeric_limits<int>::max());
        distance[src] = 0; // Khoảng cách từ nguồn đến chính nó là 0

        // Bước 1: Cập nhật khoảng cách cho tất cả các cạnh
        for (int i = 1; i <= V - 1; i++) {
            for (const auto& edge : edges) {
                // Nếu khoảng cách đến đỉnh nguồn không vô hạn
                // và có thể cập nhật khoảng cách đến đỉnh đích
                if (distance[edge.source] != numeric_limits<int>::max() &&
                    distance[edge.source] + edge.weight < distance[edge.destination]) {
                    distance[edge.destination] = distance[edge.source] + edge.weight;
                }
            }
        }

        // Bước 2: Kiểm tra chu trình âm
        for (const auto& edge : edges) {
            // Nếu có thể cập nhật khoảng cách lần nữa, có nghĩa là có chu trình âm
            if (distance[edge.source] != numeric_limits<int>::max() &&
                distance[edge.source] + edge.weight < distance[edge.destination]) {
                cout << "Đồ thị chứa chu trình âm\n";
                return;
            }
        }

        // In khoảng cách từ nguồn đến tất cả các đỉnh
        cout << "Khoảng cách từ nguồn " << src << " đến các đỉnh:\n";
        for (int i = 0; i < V; i++) {
            if (distance[i] == numeric_limits<int>::max()) {
                cout << i << "\t\tINF\n"; // Nếu khoảng cách là vô hạn
            } else {
                cout << i << "\t\t" << distance[i] << "\n"; // In khoảng cách
            }
        }
    }
};

int main() {
    int V = 5; // Số đỉnh trong đồ thị
    int E = 8; // Số cạnh trong đồ thị
    Graph g(V, E); // Tạo một đồ thị

    // Thêm các cạnh vào đồ thị
    g.addEdge(0, 0, 1, -1);
    g.addEdge(1, 0, 2, 4);
    g.addEdge(2, 1, 2, 3);
    g.addEdge(3, 1, 3, 2);
    g.addEdge(4, 1, 4, 2);
    g.addEdge(5, 3, 2, 5);
    g.addEdge(6, 3, 1, 1);
    g.addEdge(7, 4, 3, -3);

    g.bellmanFord(0); // Gọi hàm Bellman-Ford từ đỉnh nguồn 0

    return 0; // Kết thúc chương trình
}
