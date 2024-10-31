#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Cấu trúc để lưu trữ thông tin của một cạnh
struct Edge {
    int src, dest, weight; // Đỉnh nguồn, đỉnh đích và trọng số của cạnh
};

// Cấu trúc Disjoint Set để quản lý các tập hợp không giao nhau
struct DisjointSet {
    vector<int> parent, rank; // Mảng parent và rank cho các đỉnh

    // Khởi tạo Disjoint Set với n đỉnh
    DisjointSet(int n) {
        parent.resize(n); // Kích thước mảng parent
        rank.resize(n, 0); // Kích thước mảng rank và khởi tạo giá trị bằng 0
        for (int i = 0; i < n; i++)
            parent[i] = i; // Mỗi đỉnh là cha của chính nó
    }

    // Hàm tìm gốc của một đỉnh
    int find(int u) {
        if (parent[u] != u)
            parent[u] = find(parent[u]); // Cập nhật cha cho tối ưu hóa
        return parent[u];
    }

    // Hàm hợp hai tập hợp
    void unionSet(int u, int v) {
        int rootU = find(u); // Tìm gốc của u
        int rootV = find(v); // Tìm gốc của v
        if (rootU != rootV) { // Nếu u và v không cùng gốc
            // Hợp nhất theo độ sâu (rank)
            if (rank[rootU] > rank[rootV])
                parent[rootV] = rootU; // rootU là gốc
            else if (rank[rootU] < rank[rootV])
                parent[rootU] = rootV; // rootV là gốc
            else {
                parent[rootV] = rootU; // Tùy ý chọn gốc
                rank[rootU]++; // Tăng độ sâu của gốc
            }
        }
    }
};

// Hàm so sánh hai cạnh theo trọng số
bool compareEdges(const Edge &a, const Edge &b) {
    return a.weight < b.weight; // Sắp xếp tăng dần theo trọng số
}

// Hàm cài đặt giải thuật Kruskal
vector<Edge> kruskal(int n, vector<Edge> &edges) {
    // Sắp xếp các cạnh theo trọng số
    sort(edges.begin(), edges.end(), compareEdges);
    DisjointSet ds(n); // Khởi tạo Disjoint Set cho n đỉnh
    vector<Edge> mst; // Vector lưu các cạnh của cây khung tối thiểu

    // Duyệt qua các cạnh đã sắp xếp
    for (const Edge &edge : edges) {
        // Kiểm tra nếu không tạo thành chu trình
        if (ds.find(edge.src) != ds.find(edge.dest)) {
            ds.unionSet(edge.src, edge.dest); // Hợp nhất hai đỉnh
            mst.push_back(edge); // Thêm cạnh vào MST
        }
    }
    return mst; // Trả về cây khung tối thiểu
}

int main() {
    int n = 4; // Số đỉnh của đồ thị
    // Định nghĩa các cạnh của đồ thị (đỉnh nguồn, đỉnh đích, trọng số)
    vector<Edge> edges = {
        {0, 1, 10},
        {0, 2, 6},
        {0, 3, 5},
        {1, 3, 15},
        {2, 3, 4}
    };

    // Gọi hàm Kruskal để tìm MST
    vector<Edge> mst = kruskal(n, edges);
    cout << "Cây khung tối thiểu:" << endl;
    // In các cạnh của MST
    for (const Edge &edge : mst) {
        cout << edge.src << " - " << edge.dest << ": " << edge.weight << endl;
    }

    return 0; // Kết thúc chương trình
}
